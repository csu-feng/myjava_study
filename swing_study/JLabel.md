```java
Container contentPane = getContentPane();
contentPane.setLayout(new FlowLayout());

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