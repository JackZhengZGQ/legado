package io.legado.app.ui.book.read.page

import io.legado.app.service.help.ReadBook
import io.legado.app.ui.book.read.page.entities.TextChapter

interface DataSource {

    val pageIndex: Int get() = ReadBook.durChapterPos()

    val currentChapter: TextChapter?

    val nextChapter: TextChapter?

    val prevChapter: TextChapter?

    fun hasNextChapter(): Boolean

    fun hasPrevChapter(): Boolean

    fun upContent(relativePosition: Int = 0, resetPageOffset: Boolean = true)
}