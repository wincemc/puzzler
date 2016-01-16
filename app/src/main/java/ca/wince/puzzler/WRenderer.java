package ca.wince.puzzler;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView.Renderer;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 Implimentation of GLSurfaceView.WRenderer()
 */
public class WRenderer implements Renderer{

    //MEMBER VARS


    //CONSTRUCTORS
    public WRenderer(){
    }
    //END CONSTRUCTORS

    /*
        Called once to set up the view's opengl environment
     */
    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {

        // Set the background frame color
        GLES20.glClearColor(0F, 0F, 0F, 0F);
    }

    /*
        Called on each frame draw
     */
    @Override
    public void onDrawFrame(GL10 gl) {
        // Redraw background color
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
    }

    /*
        Called when the view changes dimensions (ie device rotation)
     */
    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        GLES20.glViewport(0, 0, width, height);
    }
}
