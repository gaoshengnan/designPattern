#### 建造者模式

在PersonBuilder的例子中建造小人的过程其实是稳定的，都需要头身手脚，而具体的建造细节是不一样的，有胖有瘦有高有矮，但是对于用户而言，我不需要知道细节，我只想要一个完整的瘦的人，或者一个完整的胖的人。

如果你需要将一个复杂对象的构建与它的表示分离，使得同样构建过程可以创建出不同表示的意图时，就需要建造者模式了，也叫生成器模式。

建造者模式可以将一个产品的内部表象与产品的生成过程分割开来，从而可以使一个建造过程生成不同的内部表象的产品对象，如果我们用了建造者模式，那么用户就只需指定建造的类型就可以得到它们，从而具体建造的过程和细节就不需要知道了。

> 概念：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建出不同的表示。

建造者模式的好处就是使得建造代码与表示代码分离，由于建造者隐藏了该产品是如何组装的，所以若需要改变一个产品的内部表示，只需要在定义一个具体的建造者就好了

#### builderDemo

Builder：是为创建一个Product对象的各个部件指定的抽象接口

ConcreteBuilder：具体的建造者，实现Builder接口，构造器和装配各个部件

Product：具体的产品

Director：是构建一个使用Builder接口的对象，它主要用于创建一些复杂的对象，这些对象内部构建的建造顺序通常是非常稳定的，但对象内部的构建通常面临这复杂的变化


