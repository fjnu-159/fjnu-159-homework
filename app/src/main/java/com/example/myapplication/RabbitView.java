package com.example.myapplication;
import  java.lang.Object;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

public class RabbitView extends android.view.View{
    public float bitmapX;
    public float bitmapY;
    public RabbitView(Context context){
        super(context);
        bitmapX=290;
        bitmapY=300;
    }
    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        Paint paint=new Paint();
        Bitmap bitmap=new BitmapFactory.decodeResource(this.getResources(),
                R.mipmap.rabbit);
        canvas.drawBitmap(bitmap,bitmapX,bitmapY,paint);
        if(bitmap.isRecycled()){
            bitmap.recycle();
        }

    }
}
