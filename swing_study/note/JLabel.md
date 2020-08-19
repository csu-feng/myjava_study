```
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());//布局管理器

JLabel label = new JLable();
contentPane.add(label);
```

### 修改/设置 label 显示的字符串
```
label.setText("label 字符串");
```

### 设置 label 字体，风格和大小
```
label.setFont(new Font(String FamliyName, int style, int size));
```
字体：
- 微软雅黑
- 宋体
- 黑体 等

风格（官方的4种固定值）：
- Font.PLAIN（普通）
- Font.BOLD（加粗）
- Font.ITALIC（斜体）
- Font.BOLD+ Font.ITALIC（粗斜体）

### 改变字体颜色
```
label.setForeground(Color.BLUE);
```
使用Color类
- 使用官方定义的Color.
- Color(int r, int g, intb)，填写RGB值，此时需要改为`label.setForeground(new Color(int r, int g, int b));`

### 添加提示文字（鼠标停留在label上显示）
```
label.setToolTipText(String str)
```

### 设置背景不透明
`label.setOpaque(true);`
*opaque	adj.不透明的*
**在 java 里面默认为透明的,如果不修改无法显示背景颜色;应该是为了不遮挡背景图片**

### 设置背景颜色
`label.setBackground(Color color);`

### 设置label尺寸大小
`label.setPreferredSize( new Dimension(int width, int height) );`
必须在有布局管理器下使用

### 设置水平对齐方式
`label.setHorizontalAlignment(int alignment)`
官方参数:

- SwingConstants.LEFT：左对齐；（默认值，也就是不设置时则左对齐）
- SwingConstants.CENTER：居中对齐；
- SwingConstants.RIGHT：右对齐；

### 设置垂直对齐方式
`label.setVerticalAlignment(int alignment)`
官方参数:
- SwingConstants.TOP：向上对齐；
- SwingConstants.CENTER：居中对齐；（默认值，也就是不设置时居中对齐）
- SwingConstants.BOTTOM：向下对齐；
- SwingConstants.LEADING:默认的组件上的字是从左往右读的,这个属性更改为从右往左读