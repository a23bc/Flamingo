package A2;

import android.app.RemoteAction;
import android.media.AudioFocusRequest;
import android.view.autofill.AutofillId;
import android.view.textclassifier.TextClassifier;

/* JADX INFO: renamed from: A2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0002c {
    public static /* bridge */ /* synthetic */ RemoteAction d(Object obj) {
        return (RemoteAction) obj;
    }

    public static /* synthetic */ AudioFocusRequest.Builder h(int i7) {
        return new AudioFocusRequest.Builder(i7);
    }

    public static /* synthetic */ AudioFocusRequest.Builder l(AudioFocusRequest audioFocusRequest) {
        return new AudioFocusRequest.Builder(audioFocusRequest);
    }

    public static /* bridge */ /* synthetic */ AutofillId o(Object obj) {
        return (AutofillId) obj;
    }

    public static /* bridge */ /* synthetic */ TextClassifier p(Object obj) {
        return (TextClassifier) obj;
    }

    public static /* synthetic */ void v() {
    }
}
