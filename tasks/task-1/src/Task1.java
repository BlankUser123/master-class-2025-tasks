import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.FPSAnimator;

import javax.swing.*;

public class Task1 extends JFrame {

    Task1() {

        GLProfile profile = GLProfile.get(GLProfile.GL2);
        GLCapabilities capabilities = new GLCapabilities(profile);
        GLCanvas canvas = new GLCanvas(capabilities);
        canvas.addGLEventListener(new Field());
        canvas.setSize(400, 400);
        canvas.setFocusable(true);
        getContentPane().add(canvas);
        setSize(getContentPane().getPreferredSize());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FPSAnimator animator = new FPSAnimator(canvas, 300, true);
        animator.start();
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                new Task1();
            }
        });
    }
}
