package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class B extends D {

    /* JADX INFO: renamed from: c */
    public static final Class f9386c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(int i7, long j3, Object obj) {
        List list = (List) o0.f9505d.i(j3, obj);
        if (list.isEmpty()) {
            List c0552z = list instanceof A ? new C0552z(i7) : new ArrayList(i7);
            o0.o(obj, j3, c0552z);
            return c0552z;
        }
        if (f9386c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i7);
            arrayList.addAll(list);
            o0.o(obj, j3, arrayList);
            return arrayList;
        }
        if (!(list instanceof j0)) {
            return list;
        }
        C0552z c0552z2 = new C0552z(list.size() + i7);
        c0552z2.addAll((j0) list);
        o0.o(obj, j3, c0552z2);
        return c0552z2;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final void a(long j3, Object obj) {
        Object objUnmodifiableList;
        List list = (List) o0.f9505d.i(j3, obj);
        if (list instanceof A) {
            objUnmodifiableList = ((A) list).j();
        } else {
            if (f9386c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
        }
        o0.o(obj, j3, objUnmodifiableList);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final void b(AbstractC0546t abstractC0546t, AbstractC0546t abstractC0546t2, long j3) {
        List list = (List) o0.f9505d.i(j3, abstractC0546t2);
        List listD = d(list.size(), j3, abstractC0546t);
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        o0.o(abstractC0546t, j3, list);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final List c(long j3, Object obj) {
        return d(10, j3, obj);
    }
}
