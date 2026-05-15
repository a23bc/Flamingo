package p6;

import N5.l;
import java.util.Comparator;
import yos.music.player.data.libraries.Folder;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return l.r(((Folder) obj).getName(), ((Folder) obj2).getName());
    }
}
