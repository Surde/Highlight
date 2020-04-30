package zhy.com.highlight.position;

import android.graphics.RectF;
import android.view.Gravity;

import zhy.com.highlight.HighLight;

/**
 * Created by caizepeng on 16/8/20.
 */
public class OnTopPosCallback extends OnBaseCallback {

    private int gravity = Gravity.CENTER_HORIZONTAL;
    private float rightMargin;
    private float leftMargin;

    public OnTopPosCallback() {
    }


    public OnTopPosCallback(float offset, int gravity) {
        super(offset);
        this.gravity = gravity;
    }

    public OnTopPosCallback(float offset, int gravity, float rightMargin, float leftMargin) {
        super(offset);
        this.gravity = gravity;
        this.rightMargin = rightMargin;
        this.leftMargin = leftMargin;
    }


    public OnTopPosCallback(float offset) {
        super(offset);
    }

    @Override
    public void getPosition(float rightMargin, float bottomMargin, RectF rectF, HighLight.MarginInfo marginInfo) {
//        marginInfo.leftMargin = rectF.right - rectF.width() / 2;
        marginInfo.rightMargin = this.rightMargin;
        marginInfo.leftMargin = this.leftMargin;
        marginInfo.bottomMargin = bottomMargin + rectF.height() + offset;
        marginInfo.gravity = gravity;
    }

    public OnTopPosCallback setGravity(int gravity) {
        this.gravity = gravity;
        return this;
    }

    public OnTopPosCallback setRightMargin(float rightMargin) {
        this.rightMargin = rightMargin;
        return this;
    }

    public OnTopPosCallback setLeftMargin(float leftMargin) {
        this.leftMargin = leftMargin;
        return this;
    }
}
