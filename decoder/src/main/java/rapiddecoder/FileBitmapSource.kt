package rapiddecoder

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.BitmapRegionDecoder

class FileBitmapSource(private val path: String) : BitmapSource {
    override val densityRatioSupported: Boolean
        get() = false

    override fun decode(opts: BitmapFactory.Options): Bitmap? = BitmapFactory.decodeFile(path, opts)

    override fun createRegionDecoder(): BitmapRegionDecoder =
            BitmapRegionDecoder.newInstance(path, false)
}