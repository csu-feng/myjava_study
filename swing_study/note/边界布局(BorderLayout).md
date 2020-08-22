## 边界布局(BorderLayout)

### 1. 设置布局方式
```
Container root = getContentPane();
root.setLayout(new BorderLayout());
```

### 2. 添加控件
```
JPanel jp1 = new JPanel();
JPanel jp2 = new JPanel();
root.add(jp1, BorderLayout.CENTER);
root.add(BorderLayout.WEST, jp2);
```
共有5个位置:
- BorderLayout.NORTH , 代表头部,上方
- BorderLayout.WEST , 代表左边部分
- BorderLayout.EAST , 代表右边部分
- BorderLayout.CENTER , 代表中间部分
- BorderLayout.SOUTH , 代表底部,下方