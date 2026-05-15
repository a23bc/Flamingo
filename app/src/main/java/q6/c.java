package q6;

import N5.l;
import java.util.Comparator;
import yos.music.player.ui.settingpages.others.Library;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return l.r(((Library) obj).getName(), ((Library) obj2).getName());
    }
}
