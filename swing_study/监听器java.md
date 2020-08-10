### 这是没有缩减的写法
```
//创建一个自定义监听器
 private btnlistener btnl = new btnlistener();

 //必须在一个btn创建后才添加监听器，即在类里面无法添加，构造函数可以(java version "14.0.2" 2020-07-14)
 btn.addActionListener(btnl);

 //自定义监听器的内容
 private class btnlistener implements ActionListener {
        @Override //实现接口(interface)
        public void actionPerformed(ActionEvent e) {
            //Your Code Here
    
        }
        
    }
```

### 这是缩减的写法（匿名类）
```
btn.addActionListener(new ActionListener{
	@Override
	public void actionPerformamed(ActionEvent e){
	//your code
	}
})
```

### 这是最简写法（lambda表达式）
```
btn.addActionListener( (e)->{
	//your code
}  )
```