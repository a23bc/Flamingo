package j6;

import java.util.Comparator;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer trackNumber = ((YosMediaItem) obj).getTrackNumber();
        if (trackNumber == null) {
            trackNumber = num;
        }
        Integer trackNumber2 = ((YosMediaItem) obj2).getTrackNumber();
        return N5.l.r(trackNumber, trackNumber2 != null ? trackNumber2 : 0);
    }
}
