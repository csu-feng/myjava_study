## 布局管理器之 FlowLayout (流布局)

### 在 MyFrame 中使用 FlowLayout
```
Container contentPane = getContentPane();
contentPane.setLayout( new FlowLayout() );
```
*在 new FlowLayout（） 里面可以填写*
- FlowLayout.LEFT
- FlowLayout.CENTER
- FlowLayout.RIGHT
设置对齐方式为向左，居中，向右

**这是动态的方式,组件会随着窗口大小的改变而改变**