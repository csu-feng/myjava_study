## 边距和填充(AfBorder)

### 1. 填充
```
//设置 padding 为8
AfBorder.addPadding(label, 8);
//还可以分别设置
AfBorder.addPadding(label, int top, int left, int bottom, int right);
```

### 2. 边距(同上)
```
AfBorder.addMargin(label, 8);
AfBorder.addMargin(label, int top, int left, int bottom, int right);
```

### 3. 设置内或外边框
```
AfBorder.addInnerBorder(JComponent c, Border innerBoder);
AfBorder.addOuterBorder(JComponent c, Border OuterBoder);
```
JComponent 是 JPanel, JButton, JLabel 等的父类