package com.android.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.android.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_today extends SVGRenderer {

    public ic_today(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(19.0f, 3.0f);
        mPath.rLineTo(-1.0f, 0f);
        mPath.lineTo(18.0f, 1.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.lineTo(8.0f, 3.0f);
        mPath.lineTo(8.0f, 1.0f);
        mPath.lineTo(6.0f, 1.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.lineTo(5.0f, 3.0f);
        mPath.rCubicTo(-1.11f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        mPath.lineTo(3.0f, 19.0f);
        mPath.rCubicTo(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        mPath.rLineTo(14.0f, 0f);
        mPath.rCubicTo(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mPath.lineTo(21.0f, 5.0f);
        mPath.rCubicTo(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        mPath.close();
        mPath.moveTo(19.0f, 3.0f);
        mPath.rMoveTo(0.0f, 16.0f);
        mPath.lineTo(5.0f, 19.0f);
        mPath.lineTo(5.0f, 8.0f);
        mPath.rLineTo(14.0f, 0f);
        mPath.rLineTo(0f, 11.0f);
        mPath.close();
        mPath.moveTo(19.0f, 19.0f);
        mPath.moveTo(7.0f, 10.0f);
        mPath.rLineTo(5.0f, 0f);
        mPath.rLineTo(0f, 5.0f);
        mPath.lineTo(7.0f, 15.0f);
        mPath.close();
        mPath.moveTo(7.0f, 10.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}