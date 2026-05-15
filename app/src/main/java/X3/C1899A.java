package x3;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import java.lang.ref.WeakReference;
import java.util.List;
import t.C1450e;
import w3.C1710a0;

/* JADX INFO: renamed from: x3.A */
/* JADX INFO: loaded from: classes.dex */
public final class C1899A extends MediaController.Callback {

    /* JADX INFO: renamed from: a */
    public final WeakReference f19970a;

    public C1899A(C1710a0 c1710a0) {
        this.f19970a = new WeakReference(c1710a0);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        C1710a0 c1710a0 = (C1710a0) this.f19970a.get();
        if (c1710a0 == null || playbackInfo == null) {
            return;
        }
        c1710a0.a(new C1903E(playbackInfo.getPlaybackType(), C1919d.a(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle bundle) {
        Z.a(bundle);
        C1710a0 c1710a0 = (C1710a0) this.f19970a.get();
        if (c1710a0 != null) {
            c1710a0.c(bundle);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        C1911M c1911mCreateFromParcel;
        C1710a0 c1710a0 = (C1710a0) this.f19970a.get();
        if (c1710a0 != null) {
            C1450e c1450e = C1911M.f19993q;
            if (mediaMetadata != null) {
                Parcel parcelObtain = Parcel.obtain();
                mediaMetadata.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                c1911mCreateFromParcel = C1911M.CREATOR.createFromParcel(parcelObtain);
                parcelObtain.recycle();
                c1911mCreateFromParcel.f19996p = mediaMetadata;
            } else {
                c1911mCreateFromParcel = null;
            }
            c1710a0.d(c1911mCreateFromParcel);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        C1710a0 c1710a0 = (C1710a0) this.f19970a.get();
        if (c1710a0 == null || c1710a0.f19132c != null) {
            return;
        }
        c1710a0.e(m0.a(playbackState));
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        C1710a0 c1710a0 = (C1710a0) this.f19970a.get();
        if (c1710a0 != null) {
            c1710a0.f(W.a(list));
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
        C1710a0 c1710a0 = (C1710a0) this.f19970a.get();
        if (c1710a0 != null) {
            c1710a0.g(charSequence);
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
        C1710a0 c1710a0 = (C1710a0) this.f19970a.get();
        if (c1710a0 != null) {
            c1710a0.f19134e.f19154b.a();
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        Z.a(bundle);
        C1710a0 c1710a0 = (C1710a0) this.f19970a.get();
        if (c1710a0 != null) {
            c1710a0.h(str, bundle);
        }
    }
}
