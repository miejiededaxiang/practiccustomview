package com.igding.practiccustomview.hencoderview.hencoder6;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.igding.practiccustomview.R;


public class Practice02Rotation extends RelativeLayout {
    Button animateBt;
    ImageView imageView;
    int a = 0;

    public Practice02Rotation(Context context) {
        super(context);
    }

    public Practice02Rotation(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice02Rotation(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);

        animateBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                switch (a) {
                    case 0:
                        imageView.animate().rotation(200);
                        break;
                    case 1:
                        imageView.animate().rotation(0);
                        break;
                    case 2:
                        imageView.animate().rotationX(200);
                        break;
                    case 3:
                        imageView.animate().rotationX(0);
                        break;
                    case 4:
                        imageView.animate().rotationY(200);
                        break;
                    case 5:
                        imageView.animate().rotationY(0);
                        break;
                    default:
                }
                a++;
                if (a == 6) {
                    a = 0;
                }
                // TODO 在这里处理点击事件，通过 View.animate().rotation/X/Y() 来让 View 旋转
            }
        });
    }
}