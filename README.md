# Design Pattern - 设计模式

### 一、程序员必修课程-设计模式

设计模式不是一门技术，如果你把Spring用的很顺手，这非常好，但这只是一个合格的程序员应该具备的基本能力！于是我们成为所谓的代码工人--软件行业的体力劳动者。

但是如果你通晓了这23中设计模式就不同了，你可以站在一个更高的层次去赏析程序员代码、软件设计、架构，完成从代码工人到架构师的蜕变。当然要想达到"通晓"的水平，没有工作经验的积累是不可能真正理解设计模式的，这就像大家小时候为什么不明白爸爸妈妈要工作而不能每天陪自己一样。

>对于程序员来说，设计模式可以让你写出更加高效、优雅的代码。

>对于架构师，设计模式可以让你设计出健壮、稳定、高效的系统，并且自动的预防未来业务变化可能对系统带来的影响。

>所以我认为设计模式是每一位技术人员都需要掌握的基本技能。

### 二、到底什么是设计模式？

那么到底什么是设计模式呢，简单理解它就是一套理论，由软件界的先辈们总结出的一套可以反复使用的经验，它可以提高代码的可重用性，增强系统的可维护性，以及解决一系列的复杂问题。

### 三、简单介绍designPattern（下文称: DPT）

本项目designPattern(DPT)主要涵盖自己理解的6个设计原则和23种设计模式，每个设计模式的包下面都有一个demo和README.md作详细解释，以及生活中的示例代码加深理解。

其中有大量例子帮助你理解抽象的设计模式概念，加上自己的整理和详细备注，希望对你有帮助，也是对我学习的总结。

#### 1)目录结构

DPT包括设计模式和设计原则，其中设计模式分为以下几种：

- 创建型模式(creational): 是对对象创建过程的各种问题和解决方案的总结。

- 结构型模式(structural): 是针对软件设计结构的总结，关注于类、对象继承、组合方式的实践经验。

- 行为型模式(behavioral): 是从类或对象之间交互、职责划分等角度总结的模式。

#### 2)designPattern-main-java-com-seina:
&emsp;&emsp;design.pattern  
&emsp;&emsp;&emsp;behavioral(行为型模式)  
&emsp;&emsp;&emsp;&emsp;[strategy(策略模式)](https://github.com/gaoshengnan/designPattern/tree/master/src/main/java/com/seina/design/pattern/behavioral/strategy)  
&emsp;&emsp;&emsp;&emsp;[templateMethod(模版方法模式)](https://github.com/gaoshengnan/designPattern/tree/master/src/main/java/com/seina/design/pattern/behavioral/templatemethod)  
&emsp;&emsp;&emsp;&emsp;[observer(观察者模式)](https://github.com/gaoshengnan/designPattern/tree/master/src/main/java/com/seina/design/pattern/behavioral/observer)  
&emsp;&emsp;&emsp;&emsp;[memento(备忘录模式)](https://github.com/gaoshengnan/designPattern/tree/master/src/main/java/com/seina/design/pattern/behavioral/memento)  
&emsp;&emsp;&emsp;&emsp;[state(状态模式)](https://github.com/gaoshengnan/designPattern/tree/master/src/main/java/com/seina/design/pattern/behavioral/state)  
&emsp;&emsp;&emsp;&emsp;[chainOfResponsibility(职责链模式)](https://github.com/gaoshengnan/designPattern/tree/master/src/main/java/com/seina/design/pattern/behavioral/chainOfResponsibility)  
&emsp;&emsp;&emsp;&emsp;[iterator(迭代器模式)](https://github.com/gaoshengnan/designPattern/tree/master/src/main/java/com/seina/design/pattern/behavioral/iterator)  
&emsp;&emsp;&emsp;&emsp;[command(命令模式)](https://github.com/gaoshengnan/designPattern/tree/master/src/main/java/com/seina/design/pattern/behavioral/command)  
&emsp;&emsp;&emsp;&emsp;[interpreter(解释器模式)](https://github.com/gaoshengnan/designPattern/tree/master/src/main/java/com/seina/design/pattern/behavioral/interpreter)  
&emsp;&emsp;&emsp;&emsp;[mediator(中介者模式)](https://github.com/gaoshengnan/designPattern/tree/master/src/main/java/com/seina/design/pattern/behavioral/mediator)  
&emsp;&emsp;&emsp;&emsp;[visitor(访问者模式)](https://github.com/gaoshengnan/designPattern/tree/master/src/main/java/com/seina/design/pattern/behavioral/visitor)  
&emsp;&emsp;&emsp;creational(创建型模式)  
&emsp;&emsp;&emsp;&emsp;[SimpleFactory（简单工厂模式)](https://github.com/gaoshengnan/designPattern/tree/master/src/main/java/com/seina/design/pattern/creational/simpleFactory)  
&emsp;&emsp;&emsp;&emsp;[FactoryMethod（工厂方法模式)](https://github.com/gaoshengnan/designPattern/tree/master/src/main/java/com/seina/design/pattern/creational/factoryMethod)  
&emsp;&emsp;&emsp;&emsp;[abstractFactory（抽象工厂模式)](https://github.com/gaoshengnan/designPattern/tree/master/src/main/java/com/seina/design/pattern/creational/abstractFactory)  
&emsp;&emsp;&emsp;&emsp;[prototype(原型模式)](https://github.com/gaoshengnan/designPattern/tree/master/src/main/java/com/seina/design/pattern/creational/prototype)  
&emsp;&emsp;&emsp;&emsp;[builder(建造者模式)](https://github.com/gaoshengnan/designPattern/tree/master/src/main/java/com/seina/design/pattern/creational/builder)  
&emsp;&emsp;&emsp;&emsp;[singleton(单例模式)](https://github.com/gaoshengnan/designPattern/tree/master/src/main/java/com/seina/design/pattern/creational/singleton)  
&emsp;&emsp;&emsp;structural(结构型模式)  
&emsp;&emsp;&emsp;&emsp;[decorator(装饰模式)](https://github.com/gaoshengnan/designPattern/tree/master/src/main/java/com/seina/design/pattern/structural/decorator)  
&emsp;&emsp;&emsp;&emsp;[proxy(代理模式)](https://github.com/gaoshengnan/designPattern/tree/master/src/main/java/com/seina/design/pattern/structural/proxy)  
&emsp;&emsp;&emsp;&emsp;[facade(外观模式)](https://github.com/gaoshengnan/designPattern/tree/master/src/main/java/com/seina/design/pattern/structural/facade)  
&emsp;&emsp;&emsp;&emsp;[adapter(适配器模式)](https://github.com/gaoshengnan/designPattern/tree/master/src/main/java/com/seina/design/pattern/structural/adapter)  
&emsp;&emsp;&emsp;&emsp;[bridge(桥接模式)](https://github.com/gaoshengnan/designPattern/tree/master/src/main/java/com/seina/design/pattern/structural/bridge)  
&emsp;&emsp;&emsp;&emsp;[composite(组合模式)](https://github.com/gaoshengnan/designPattern/tree/master/src/main/java/com/seina/design/pattern/structural/composite)  
&emsp;&emsp;&emsp;&emsp;[flyweight(享元模式)](https://github.com/gaoshengnan/designPattern/tree/master/src/main/java/com/seina/design/pattern/structural/flyweight)  
&emsp;&emsp;principle（设计原则）

     ...随着我的学习陆续更新中ing
   
### 四、加油 

作为技术人员，基本的品质就是真诚，"知之为知之，不知为不知，是知也"，其实自己不懂也没关系，去学，学无止境，但是千万不要贪多。

有细心的人可以关注到DPT项目的commit是在持续更新的，最开始学习设计模式的时候，我基本上是利用每天晚上下班之后的时间，一个人开始啃设计模式，啃一个练习一下，并不是一天，也不是一周看完23种设计模式，正所谓欲速则不达，是讲不能一口气就可以吃一个胖子。

应该要坚持，始终如一的去做一件事情，持之以恒，而不是快速消化，别人花几年研究出来的思想，你想几天就吃透？绝对不可能的。所以我喜欢在一个事情上"死磕"，当然不是很死板的那种，而是先精一项技术，再发散学习，先点后面，最后达到既有广度又有深度，才是王道！

> 挑战设计模式，每个设计出优雅代码的程序媛都是女神

>编程是一门技术，更是一门艺术，不能只满足于写完代码运行结果正确就完事，时常考虑如何让代码更加简练，更加容易维护，容易扩展和复用，只有这样才能有所提高。


### 五、注

设计原则还没有在该DPT项目中体现，感兴趣的可以在 [seina.top](http://seina.top) 里查看个别设计原则相关的文章。

>最后祝你早日掌握设计模式，成为一个真正的有设计思想的开发工程师！
