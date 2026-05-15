package x3;

import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import j5.AbstractC1107a;

/* JADX INFO: renamed from: x3.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1904F extends AbstractC1107a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaController.TransportControls f19983a;

    public C1904F(MediaController.TransportControls transportControls) {
        this.f19983a = transportControls;
    }

    public void G() {
        K("android.support.v4.media.session.action.PREPARE", null);
    }

    public void H(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID", str);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        K("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID", bundle2);
    }

    public void I(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("android.support.v4.media.session.action.ARGUMENT_QUERY", str);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        K("android.support.v4.media.session.action.PREPARE_FROM_SEARCH", bundle2);
    }

    public void J(Uri uri, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", uri);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        K("android.support.v4.media.session.action.PREPARE_FROM_URI", bundle2);
    }

    public final void K(String str, Bundle bundle) {
        if (str != null && ((str.equals("android.support.v4.media.session.action.FOLLOW") || str.equals("android.support.v4.media.session.action.UNFOLLOW")) && (bundle == null || !bundle.containsKey("android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE")))) {
            throw new IllegalArgumentException(Z1.l.q("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ", str, "."));
        }
        this.f19983a.sendCustomAction(str, bundle);
    }

    public void L(float f7) {
        if (f7 == 0.0f) {
            throw new IllegalArgumentException("speed must not be zero");
        }
        Bundle bundle = new Bundle();
        bundle.putFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", f7);
        K("android.support.v4.media.session.action.SET_PLAYBACK_SPEED", bundle);
    }
}
