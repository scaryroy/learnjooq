/**
 * This class is generated by jOOQ
 */
package models.jooq


import java.lang.Long

import javax.annotation.Generated

import models.jooq.Public

import org.jooq.Sequence
import org.jooq.impl.SequenceImpl


/**
 * Convenience access to all sequences in public
 */
@Generated(
	value = Array(
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	),
	comments = "This class is generated by jOOQ"
)
object Sequences {

	/**
	 * The sequence <code>public.author_id_seq</code>
	 */
	val AUTHOR_ID_SEQ : Sequence[Long] = new SequenceImpl[Long]("author_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false))
}