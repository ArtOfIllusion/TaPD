/*
 *  Custom BToolTip
 */
/*
 *  Copyright 2004 Francois Guillet
 *  This program is free software; you can redistribute it and/or modify it under the
 *  terms of the GNU General Public License as published by the Free Software
 *  Foundation; either version 2 of the License, or (at your option) any later version.
 *  This program is distributed in the hope that it will be useful, but WITHOUT ANY
 *  WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 *  PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 */
package artofillusion.tapDesigner;

//{{{ Imports
import buoy.event.*;
import buoy.internal.*;
import buoy.widget.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//}}}

/**
 *  Description of the Class
 *
 *@author     François Guillet
 *@created    9 august 2004
 */
public class TapBToolTip
         extends BToolTip
{
    private Widget w;


    /**
     *  Constructor for the TapBToolTip object
     *
     *@param  c  Description of the Parameter
     */
    public TapBToolTip( Component c )
    {
        component = c;
    }


    /**
     *  Create a new TapBToolTip.
     *
     *@param  text  the text to display in the tool tip
     */

    public TapBToolTip( String text )
    {
        component = new JToolTip();
        ( (JToolTip) component ).setTipText( text );
    }


    /**
     *  Get the text to display on the tool tip.
     *
     *@return    The text value
     */

    public String getText()
    {

        if ( component instanceof JToolTip )
            return ( (JToolTip) component ).getTipText();
        else
            return "";
    }


    /**
     *  Set the text to display on the tool tip.
     *
     *@param  text  The new text value
     */

    public void setText( String text )
    {
        if ( component instanceof JToolTip )
            ( (JToolTip) component ).setTipText( text );
        invalidateSize();
    }


    /**
     *  Description of the Method
     *
     *@param  widget  Description of the Parameter
     *@param  where   Description of the Parameter
     */
    public void show( Widget widget, Point where )
    {
        super.show( widget, where );
    }
}

