package af.swing.border;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.border.Border;

/** AfBorder: 用于快速设置边框和边距
 * 
 *  要求：自己也能写出来这个工具类
 */
public class AfBorder
{
	// 设置内间距
	public static void addPadding(JComponent c, int size)
	{
		addPadding(c, size, size, size, size);
	}
	
	// 设置内间距
	public static void addPadding(JComponent c, int top, int left, int bottom, int right)
	{
		Border border = BorderFactory.createEmptyBorder(top, left, bottom, right);
		addInnerBorder(c, border);
	}
	
	// 设置外间距
	public static void addMargin(JComponent c, int size)
	{
		addMargin(c, size, size, size, size);
	}
	
	// 设置外间距
	public static void addMargin(JComponent c, int top, int left, int bottom, int right)
	{
		Border border = BorderFactory.createEmptyBorder(top, left, bottom, right);
		addOuterBorder(c, border);
	}
	
	// 附加一个外边框
	public static void addOuterBorder(JComponent c, Border outerBorder)
	{
		Border border = c.getBorder();
		if(border != null)
		{
			// 如果原来有一个边框，则进行复合
			border = BorderFactory.createCompoundBorder(outerBorder,border);
			c.setBorder( border );
		}
		else
		{
			c.setBorder(outerBorder);
		}
	}

	// 附加一个内边框
	public static void addInnerBorder(JComponent c, Border innerBorder)
	{
		Border border = c.getBorder();
		if(border != null)
		{
			// 如果原来有一个边框，则进行复合
			border = BorderFactory.createCompoundBorder(border, innerBorder);
			c.setBorder( border );
		}
		else
		{
			c.setBorder(innerBorder);
		}
	}
}
