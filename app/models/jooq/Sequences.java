/**
 * This class is generated by jOOQ
 */
package jooq;


import javax.annotation.Generated;

import jooq.Public;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in public
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

	/**
	 * The sequence <code>public.author_id_seq</code>
	 */
	public static final Sequence<Long> AUTHOR_ID_SEQ = new SequenceImpl<Long>("author_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}
