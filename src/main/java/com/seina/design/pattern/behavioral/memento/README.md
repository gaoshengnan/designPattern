## 备忘录模式

### mementoDemo

>备忘录模式：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样以后就可将该对象恢复到原先保存的状态。

Original：发起人，负责创建一个备忘录Memento，用以记录当前时刻它的内部状态，并可使用备忘录恢复内部状态。Originator可根据需要决定Memento存储Originator的哪些内部状态。

Memento：备忘录，负责存储Originator对象的内部状态，并可防止Originator以外的其他对象访问备忘录。备忘录有两个接口，Caretaker只能看到备忘录的窄接口，它只能将备忘录传递给其他对象。Originator能够看到一个宽接口，允许它访问返回先前状态所需的所有数据。

Caretaker：管理者，负责保存好备忘录Memento，不能对备忘录的内容进行操作和检查。