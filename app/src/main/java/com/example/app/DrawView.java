package com.example.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by John on 2/28/14.
 */
public class DrawView extends View {

    Context context;

    public DrawView(Context context) {
        super(context);
        this.context = context;
    }

    @Override
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);
        Paint p = new Paint();
        p.setColor(Color.RED);
        canvas.drawRect(0,0,100,100, p);

        Bitmap helmet = BitmapFactory.decodeResource(context.getResources(), R.drawable.space_helmet);
        canvas.drawBitmap(helmet, 0, 0, new Paint());

        this.invalidate();

    }
}
