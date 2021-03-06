## 观察者模式

#### bothwayCoupling：双向耦合的代码

> 前台类Secretary和看股票的人StockObserver之间相互耦合，前台类要增加观察者，观察者需要前台的状态，然后被通知，在修改自己的工作状态，停止玩股票，继续工作

现在观察者当中有玩股票的人观察这前台的状态，即老板来了没，如果增加了看MBA网上直播的人，需要添加改动前台代码，这不符合开闭原则，其次是应该让所有程序都依赖抽象，不应该相互依赖。


#### unCoupleOne

> 让两个观察者去继承抽象观察者，对于update()的方法做重写操作，前台秘书的编写，把所有具体的观察者耦合的地方改成了抽象观察者，成功实现了两个观察者依赖抽象观察者，前台秘书也依赖观察者，这就是所谓的依赖倒置原则，高层模块不依赖底层模块，二者都依赖其抽象

但是在具体观察者中也会和具体的前台秘书类耦合，所以前台秘书类也应该抽象出来，老板回来了，大家都停止玩股票和看MBA网上直播，所以老板在此场景中的角色也相当于是通知者


>观察者模式：又叫发布订阅模式，观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。这个主题对象在状态发生变化时，会通知所有观察者对象，使它们能够自动更新自己。

- Subject：可翻译为主题或抽象通知者，一般用一个抽象类或者一个接口实现，它把所有对观察者对象的引用保存在一个集合里，每个主题都可以有任何数量的观察者。抽象主题提供一个接口，可以增加和删除对象

- ConcreteSubject：具体主题或具体通知者，将有关状态存入具体观察者对象，在具体主题的内部状态改变时，给所有登记过的作者发出通知，具体主题通常用一个具体子类实现

- Observer：抽象观察者，为所有的具体观察者定义一个接口，在得到主题的通知时更新自己

- ConcreteObserver：具体观察者，实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题的状态相协调，具体观察者角色可以保存一个指向具体主题对象的引用，具体观察者角色通常用一个具体子类实现

将一个系统分割成一系列相互协作的类有一个很不好的副作用，那就是需要维护相关对象间一致性。我们不希望为了维持一致性而使各类紧密耦合，这样会给维护、扩展和重用都带来不便。

而观察者模式的关键对象是主题Subject和观察者Observer，一个Subject可以有任意数目的依赖它的Observer，一旦Subject的状态发生了改变，也就是说，所有的Observer都会得到通知。Subject发出通知的时候并不需要知道谁是它的观察者，也就是说，具体观察者是谁，它根本不需要知道，而任何一个具体观察者不知道也不需要知道其他观察者的存在。

当一个对象的改变需要同时改变其他对象，并且它不知道具体有多少对象有待改变时，应该考虑使用观察者模式。

另外观察者所做的工作其实就是在接触耦合，让耦合的双方都依赖于抽象，而不是依赖于具体。从而使得各自的变化都不会影响另一边的变化，这是依赖导致原则的最佳实践。