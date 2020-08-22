## 边框(Border)
*Border本身是接口*


### 1. 实线边框和添加边框
```
Label label = new Label("红色");
//创建黑色的边框,粗细大小是5
Border bo = new LineBorder(Color.BLACK, 5);
//给 label 添加边框
label.setBorder(bo);
```
还可以使用 BorderFactory.createLineBorder , BorderFactory.createDashedBorder 等**静态方法**创建Border
``

### 2. 具有“浮雕化”外观效果的边框
```
BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
```
- EtchedBorder.RAISED,凸起
- EtchedBorder.LOWERED,凹陷

### 3. 特种边框(4条边可设置)
```
BorderFactory.createMatteBorder(int top, int left, int bottom, int right, Color color);
```
设置上左下右边框粗细程度和边框颜色

### 4. 带标题的边框
`BorderFactory.createTitledBorder("title");`

### 5. 复合边框
```
//定义外层边框
Boder outer = BorderFactory.createLineBorder(Color.RED, 4);
//定义内层边框
Boder inner = BorderFactory.createLineBorder(Color.BLUE, 4);
//合并成一个复合边框
Boder compoud = BorderFactory.createLineBorder(outer, inner);
//添加边框
label.setBorder(compoud);
```
compoud 还可以接着嵌套成三层复合边框