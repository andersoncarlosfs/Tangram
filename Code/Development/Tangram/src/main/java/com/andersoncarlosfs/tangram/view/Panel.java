/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andersoncarlosfs.tangram.view;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author Anderson Carlos Ferreira da Silva
 */
public class Panel extends JPanel {

    //
    protected JPanel panelHeader;
    protected JPanel panelBody;

    public Panel() {

        super();

        panelHeader = new JPanel();
        panelBody = new JPanel();

        super.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        super.add(Box.createVerticalStrut(10));
        super.add(panelHeader);
        super.add(Box.createVerticalStrut(10));
        super.add(panelBody);
        super.add(Box.createVerticalStrut(10));

    }

}
