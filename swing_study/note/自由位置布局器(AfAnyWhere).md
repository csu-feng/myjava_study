## 自由位置布局器(AfAnyWhere)

### 1. 设置布局方式(导入af包)
```
Container contentPane = getContentPane();
contentPane.setLayout(new AfAnyWhere());
```

### 2. 添加控件
创建控件:
```
ColorLabel label1 = new ColorLabel("红色", Color.RED);
ColorLabel label2 = new ColorLabel("蓝色", Color.BLUE);
ColorLabel label3 = new ColorLabel("黄色", Color.YELLOW);
```
*ColorLabel是自定义的带背景颜色的Label子类*


可以调整控件大小:
`label3.setPreferredSize( new Dimension( 100,  100) );`
也可以根据窗口计算相对大小,比如铺满(见下)`new AfMargin(0, 0, 0, 0)`

添加控件:
```
//AfMargin(top, left, below, right),上左下右的距离
root.add(label1, new AfMargin(0, 0, -1, -1));//左上
root.add(label2, new AfMargin(0, -1, -1, 0));//右上
root.add(label3, new AfMargin(-1, -1, -1, -1));//正中间
```
**-1代表自适应,自动计算**
*在AfMargin里面定义了 9个常见的位置,例如可以直接使用AfMargin.FULL代替new AfMargin(0, 0, 0,0)*
```
public static final AfMargin FULL = new AfMargin(0, 0, 0,0);
public static final AfMargin TOP_LEFT = new AfMargin(0, 0, -1, -1);
public static final AfMargin TOP_CENTER = new AfMargin(0, -1, -1, -1);
public static final AfMargin TOP_RIGHT = new AfMargin(0, -1, -1, 0);
public static final AfMargin CENTER_LEFT = new AfMargin(-1, 0, -1, -1);
public static final AfMargin CENTER = new AfMargin(-1, -1, -1, -1);
public static final AfMargin CENTER_RIGHT = new AfMargin(-1, -1, -1, 0);
public static final AfMargin BOTTOM_LEFT = new AfMargin(-1, 0, 0, -1);
public static final AfMargin BOTTOM_CENTER = new AfMargin(-1, -1, 0, -1);
public static final AfMargin BOTTOM_RIGHT = new AfMargin(-1, -1, 0, 0);
```