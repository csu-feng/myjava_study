## 卡片布局 CardLayout
在一个 Container 或者 JPanel 里面设置布局方式(假设是pane)
`pane.setLayout( new CardLayout() );`


### 在 pane 里面添加卡片,注意添加卡片名字
`pane.add( cc1, "name")`

 ### 选择显示 pane 指定名字卡片

`cardLayout.show(pane, "name")`