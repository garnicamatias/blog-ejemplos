/**
 * This class is generated by jOOQ
 */
package io.github.picodotdev.blogbitix.multidatabase.jooq.purchases;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in PURCHASES
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

	/**
	 * The sequence <code>PURCHASES.SYSTEM_SEQUENCE_9404142C_B377_4B38_98D1_CB52F95283F2</code>
	 */
	public static final Sequence<Long> SYSTEM_SEQUENCE_9404142C_B377_4B38_98D1_CB52F95283F2 = new SequenceImpl<Long>("SYSTEM_SEQUENCE_9404142C_B377_4B38_98D1_CB52F95283F2", Purchases.PURCHASES, org.jooq.impl.SQLDataType.BIGINT);
}