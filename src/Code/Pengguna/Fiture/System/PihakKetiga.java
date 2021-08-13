/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code.Pengguna.Fiture.System;
import javax.swing.JPanel;



/**
 *
 * @author Kintan Khairunnisa(1402019052)
 * @author Muhammad Rizky Yuhari(1402019075)
 * @author Rangga Pujangga(1402019090)
 * @author Muhamad Rifqi(1402019058)

 */
public class PihakKetiga {
        private JPanel container;
        private JPanel content;

     public PihakKetiga(JPanel container, JPanel content) {
        this.container = container;
        this.content = content;
        this.container.removeAll();
        this.container.revalidate();
        this.container.repaint();
        
        this.container.add(this.content);
        this.container.revalidate();
        this.container.repaint();
    }
}
