package w2;

import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Message f18874a;

    public final void a() {
        this.f18874a = null;
        ArrayList arrayList = q.f18875b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.f18874a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
