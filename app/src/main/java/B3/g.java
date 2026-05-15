package B3;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g extends RemoteCallbackList {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MultiInstanceInvalidationService f836a;

    public g(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f836a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        HashMap map = this.f836a.f9830p;
        Integer num = (Integer) obj;
        num.intValue();
        map.remove(num);
    }
}
