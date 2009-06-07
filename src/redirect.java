/*This is pretty much copied letter for letter from  the 'Java Redirector'
That was written by  xdebugx Jeremiah McLeod and doens't give any idea of a language

Use like this (in html):

<APPLET CODE="redirector.class" WIDTH=500 HEIGHT=200>
<param name="URL" value="http://www.xdebugx.net">
<param name="PAGE" value="new">
<param name="delay" value="0">
<param name="IMAGE" value="asmback.gif">
<param name="stretchimage" value = "yes">
<param name="text" value="You are being redirected to www.xdebugx.net">
<param name="font" value="Arial">
<param name="fontsize" value = "20">
<param name="backcolor" value = "yellow">
<param name="textcolor" value = "red">
</APPLET>
*/



import java.awt.*;
import java.applet.*;
import java.net.*;


public class redirect extends Applet implements Runnable {


	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Thread t;  //main thread

	  Image back; //background image

	  Image imgBuffer;   // buffer image

	  Graphics grBuffer;  //main graphics object
	  int height,width;  //height and width of applet

	  String paramBack="Error",paramUrl="Error",paramDelay="Error",
			 paramFont="Error",paramFontSize="Error",paramText="Error",
			 paramBackCol="Error",paramTextCol="Error",paramStretch="Error",paramPage="Error";

	  FontMetrics fontInfo;

	  Font font;

	  int delay=0,lineWidth,lineHeight;

	  Color foreCol,backCol;


	public void init () {
	paramBack="Error";
	paramUrl="Error";
	paramDelay="Error";
	paramFont="Error";
	paramFontSize="Error";
	paramText="Error";
	paramBackCol="Error";
	paramTextCol="Error";
	paramStretch="Error";
	paramPage="Error";

	int fontSize;

	width = this.getSize().width;
	height = this.getSize().height;
	try {
	paramUrl = getParameter ("URL");
	} catch (Exception e) {
	paramUrl = "Error";
	}
	if (paramUrl==null) paramUrl = "Error";

	try {
	paramPage = getParameter ("PAGE");
	} catch (Exception e) {
	paramPage = "Error";
	}
	if (paramPage==null) paramPage = "Error";


	try {
	paramBackCol = getParameter ("BACKCOLOR");
	} catch (Exception e) {
	paramBackCol = "Error";
	}
	if (paramBackCol==null) paramBackCol = "Error";

	try {
	paramStretch = getParameter ("STRETCHIMAGE");
	} catch (Exception e) {
	paramStretch = "Error";
	}
	if (paramStretch==null) paramStretch = "Error";

	try {
	paramTextCol = getParameter ("TEXTCOLOR");
	} catch (Exception e) {
	paramTextCol = "Error";
	}
	if (paramTextCol==null) paramTextCol = "Error";


	try {
	paramFont = getParameter ("FONT");
	} catch (Exception e) {
	paramFont = "Error";
	}
	if (paramFont==null) paramFont = "Error";

	try {
	paramText = getParameter ("TEXT");
	} catch (Exception e) {
	paramText = "Error";
	}
	if (paramText==null) paramText = "Error";

	try {
	paramFontSize = getParameter ("FONTSIZE");
	} catch (Exception e) {
	paramFontSize = "Error";
	}
	if (paramFontSize==null) paramFontSize = "Error";


	try {
	paramBack = getParameter ("IMAGE");
	} catch (Exception e) {
	paramBack = "Error";
	}
	if (paramBack==null) paramBack = "Error";

	try {
	paramDelay = getParameter ("DELAY");
	} catch (Exception e) {
	paramDelay = "Error";
	}
	if (paramDelay==null) paramDelay = "Error";

	if (paramUrl.equals ("Error")) {
	try {
	paramUrl = getParameter ("url");
	} catch (Exception e) {
	paramUrl = "Error";
	}
	if (paramUrl==null) paramUrl = "Error";
	}

	if (paramUrl.equals ("Error")) {
	try {
	paramPage = getParameter ("page");
	} catch (Exception e) {
	paramPage = "Error";
	}
	if (paramPage==null) paramPage = "Error";
	}

	if (paramFont.equals ("Error")) {
	try {
	paramFont = getParameter ("font");
	} catch (Exception e) {
	paramFont = "Error";
	}
	if (paramFont==null) paramFont = "Error";
	}

	if (paramFontSize.equals ("Error")) {
	try {
	paramFontSize = getParameter ("fontsize");
	} catch (Exception e) {
	paramFontSize = "Error";
	}
	if (paramFontSize==null) paramFontSize = "Error";
	}

	if (paramBack.equals ("Error")) {
	try {
	paramBack = getParameter ("image");
	} catch (Exception e) {
	paramBack = "Error";
	}
	if (paramBack==null) paramBack = "Error";
	}

	if (paramBackCol.equals ("Error")) {
	try {
	paramBackCol = getParameter ("backcolor");
	} catch (Exception e) {
	paramBackCol = "Error";
	}
	if (paramBackCol==null) paramBackCol = "Error";
	}

	if (paramTextCol.equals ("Error")) {
	try {
	paramTextCol = getParameter ("textcolor");
	} catch (Exception e) {
	paramTextCol = "Error";
	}
	if (paramTextCol==null) paramTextCol = "Error";
	}

	if (paramStretch.equals ("Error")) {
	try {
	paramStretch = getParameter ("stretchimage");
	} catch (Exception e) {
	paramStretch = "Error";
	}
	if (paramStretch==null) paramStretch = "Error";
	}



	if (paramDelay.equals ("Error")) {
	try {
	paramDelay = getParameter ("delay");
	} catch (Exception e) {
	paramDelay = "Error";
	if (paramDelay==null) paramDelay = "Error";
	}
	}

	if (paramText.equals ("Error")) {
	try {
	paramText = getParameter ("text");
	} catch (Exception e) {
	paramText = "Error";
	if (paramText==null) paramText = "Error";
	}
	}



	delay=5;
	try {
	delay = Integer.parseInt (paramDelay);
	} catch (Exception e) {
	delay=5;
	}

	fontSize=12;
	try {
	fontSize = Integer.parseInt (paramFontSize);
	} catch (Exception e) {
	fontSize=12;
	}


	if (!paramBack.equals ("Error") && !paramBack.equals ("none")) {
	back = getImage( getCodeBase(), paramBack);  //get background image
	if (paramStretch.equals ("YES") || paramStretch.equals ("yes")) {
	back=back.getScaledInstance(width,height,Image.SCALE_AREA_AVERAGING);
	}// if stretch
	}// if back


	      // Set up the double buffering stuff only need to do this once since
	      // it's a member and we don't dispose of it.
	      imgBuffer = createImage (width, height);
	      grBuffer = imgBuffer.getGraphics ();
		  // done double buffer setup

	if (!paramPage.equals ("new") && !paramPage.equals ("NEW") && !paramPage.equals ("same") && !paramPage.equals ("SAME")) paramPage="SAME";

	if (!paramFont.equals ("Error")) {
	try {
	font = new Font (paramFont,Font.PLAIN,fontSize);
	grBuffer.setFont (font);
	} catch (Exception e) {
	paramFont="Courier";
	font = new Font (paramFont,Font.PLAIN,12);
	grBuffer.setFont (font);
	}
	}
	else {
	paramFont="Courier";
	font = new Font (paramFont,Font.PLAIN,12);
	grBuffer.setFont (font);
	}


	fontInfo = getFontMetrics(font);
	lineWidth=fontInfo.stringWidth (paramText);
	lineHeight=fontSize;

	if (!paramBackCol.equals ("Error") && !paramBackCol.equals ("none"))
	backCol=convStrCol(paramBackCol);
	else
	backCol = Color.white;

	if (!paramTextCol.equals ("Error") && !paramTextCol.equals ("none"))
	foreCol=(convStrCol(paramTextCol));
	else
	foreCol = Color.black;




	}



	public void paint (Graphics g) {	
	grBuffer.setColor (backCol);
	grBuffer.fillRect (0,0,width,height);
	grBuffer.setColor (foreCol);
	if (!paramBack.equals ("Error") && !paramBack.equals ("none"))

	if (back.getWidth(this)!=width || back.getHeight(this)!=height) {
		grBuffer.drawImage (back, 0+((width-back.getWidth(this))/2),0+((height-back.getHeight(this))/2),this);
	} else grBuffer.drawImage (back, 0, 0, this); //put the background to the buffer
	if (!paramText.equals ("Error") && !paramText.equals ("none")) {
	int a,b;
	a=((height-lineHeight)/2)+lineHeight;
	if (lineWidth<width) b=(width-lineWidth)/2;
	else b=0;
	grBuffer.drawString (paramText,b,a);
	}

	g.drawImage (imgBuffer, 0, 0, this);  // draw the buffer to the screen

	}

	 public void run() {
			long t1,t2;
			t1=getTime ();
			boolean done=false;
	     
	     
	    
	    
	    while (done==false) {
		repaint ();

		t2=getTime ();
		if ((int) ((t2-t1)/1000) >= delay && !paramUrl.equals ("Error")) {
		try {
		URL url = new URL(paramUrl);
		if (paramPage.equals ("same") || paramPage.equals ("SAME")) getAppletContext().showDocument(url, "_self");         //Redirect to the new page
		else getAppletContext().showDocument(url, "_new");
		} catch (MalformedURLException f) { }
		done=true;
		}
		 try {
				Thread.sleep (100);
			 } catch (InterruptedException ie)  { return; }

	}// while true
	}// run


	public void start() {
	t= new Thread (this);
	t.start ();

	}//start

	public void stop() {

	}//stop

	public void update (Graphics g) {
	paint (g);
	}

	static Color convStrCol (String str) {
		if (str.equals("green")) return (Color.green);
		if (str.equals("black")) return (Color.black);
		if (str.equals("white")) return (Color.white);
		if (str.equals("blue")) return (Color.blue);
		if (str.equals("gray")) return (Color.gray);
		if (str.equals("red")) return (Color.red);
		if (str.equals("yellow")) return (Color.yellow);
		if (str.equals("pink")) return (Color.pink);
		if (str.equals("orange")) return (Color.orange);
		if (str.equals("magenta")) return (Color.magenta);
		if (str.equals("cyan")) return (Color.cyan);
		return (Color.white);


		}

	public long getTime () {
	return (System.currentTimeMillis ());
	}//get time


	} //class xdebugx