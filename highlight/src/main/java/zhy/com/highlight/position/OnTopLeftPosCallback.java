package zhy.com.highlight.position;

import android.graphics.RectF;
import android.view.Gravity;

import zhy.com.highlight.HighLight;

/**
 * Created by caizepeng on 16/8/20.
 */
public class OnTopLeftPosCallback extends OnBaseCallback {

    private int gravity = Gravity.NO_GRAVITY;

    public OnTopLeftPosCallback() {
    }

    public OnTopLeftPosCallback(float offset) {
        super(offset);
    }

    public OnTopLeftPosCallback(float offset, int gravity) {
        super(offset);
        this.gravity = gravity;
    }

    @Override
    public void getPosition(float rightMargin, float bottomMargin, RectF rectF, HighLight.MarginInfo marginInfo) {
        marginInfo.rightMargin = rightMargin;
        marginInfo.bottomMargin = bottomMargin + rectF.height() + offset;
        marginInfo.gravity = gravity;
    }

    public OnTopLeftPosCallback setGravity(int gravity) {
        this.gravity = gravity;
        return this;
    }
}
