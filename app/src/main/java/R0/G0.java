package R0;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G0 f6310a = new G0();

    public final boolean a(MotionEvent motionEvent, int i7) {
        return (Float.floatToRawIntBits(motionEvent.getRawX(i7)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i7)) & Integer.MAX_VALUE) < 2139095040;
    }
}
