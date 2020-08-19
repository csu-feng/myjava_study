//package swing_study;
import java.awt.*;

public abstract class SimpleLayout implements LayoutManager{
	@Override
	public void addLayoutComponent(String name, Component comp){
	
	}
	
	@Override
	public void removeLayoutComponent(Component comp){
	
	}
	
	@Override
	public Dimension preferredLayoutSize(Container parent){
		return null;
	}
	
	@Override
	public Dimension minimumLayoutSize(Container parent){
		return null;
	}
	
	//继承这个类只要重写:
    /*
    @Override
	public void layoutContainer(Container parent){
	
	}
	*/
}
