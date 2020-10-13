package com.main;

import com.gui.SimulatorFrontPanel;

import java.awt.*;

/**
 * run program
 */
public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SimulatorFrontPanel window = new SimulatorFrontPanel();
                    window.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
