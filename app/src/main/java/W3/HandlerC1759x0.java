package w3;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import x3.C1925j;
import x3.C1927l;
import x3.C1928m;

/* JADX INFO: renamed from: w3.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC1759x0 extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f19388a = 0;

    /* JADX INFO: renamed from: b */
    public Object f19389b;

    /* JADX INFO: renamed from: c */
    public Object f19390c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1759x0(A0 a0, Looper looper) {
        super(looper);
        this.f19390c = a0;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (this.f19388a) {
            case 1:
                WeakReference weakReference = (WeakReference) this.f19390c;
                if (weakReference == null) {
                    return;
                }
                Messenger messenger = (Messenger) weakReference.get();
                C1925j c1925j = (C1925j) ((WeakReference) this.f19389b).get();
                if (messenger == null || c1925j == null) {
                    return;
                }
                Bundle data = message.getData();
                x3.Z.a(data);
                try {
                    int i7 = message.what;
                    if (i7 == 1) {
                        x3.Z.a(data.getBundle("data_root_hints"));
                        data.getString("data_media_item_id");
                        return;
                    }
                    if (i7 != 2) {
                        if (i7 != 3) {
                            message.toString();
                            return;
                        }
                        x3.Z.a(data.getBundle("data_options"));
                        x3.Z.a(data.getBundle("data_notify_children_changed_options"));
                        String string = data.getString("data_media_item_id");
                        ArrayList parcelableArrayList = data.getParcelableArrayList("data_media_item_list");
                        Parcelable.Creator<C1927l> creator = C1927l.CREATOR;
                        if (parcelableArrayList != null) {
                            ArrayList arrayList = new ArrayList();
                            for (int i8 = 0; i8 < parcelableArrayList.size(); i8++) {
                                arrayList.add(j0.k.s((Parcelable) parcelableArrayList.get(i8), creator));
                            }
                        }
                        if (c1925j.f20057g != messenger) {
                            return;
                        }
                        if (string != null && c1925j.f20055e.get(string) != null) {
                            throw new ClassCastException();
                        }
                        int i9 = C1928m.f20066b;
                        return;
                    }
                    return;
                } catch (BadParcelableException unused) {
                    return;
                }
            default:
                super.handleMessage(message);
                return;
        }
    }

    public HandlerC1759x0(C1925j c1925j) {
        this.f19389b = new WeakReference(c1925j);
    }
}
