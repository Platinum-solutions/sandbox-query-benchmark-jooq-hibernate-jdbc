/**
 * This class is generated by jOOQ
 */
package demo.dom;


import demo.dom.tables.TAuthor;
import demo.dom.tables.TBook;
import demo.dom.tables.records.RAuthorRecord;
import demo.dom.tables.records.RBookRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>PUBLIC</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final Identity<RAuthorRecord, Long> IDENTITY_AUTHOR = Identities0.IDENTITY_AUTHOR;
	public static final Identity<RBookRecord, Long> IDENTITY_BOOK = Identities0.IDENTITY_BOOK;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<RAuthorRecord> PK_AUTHOR = UniqueKeys0.PK_AUTHOR;
	public static final UniqueKey<RBookRecord> PK_BOOK = UniqueKeys0.PK_BOOK;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends AbstractKeys {
		public static Identity<RAuthorRecord, Long> IDENTITY_AUTHOR = createIdentity(TAuthor.AUTHOR, TAuthor.AUTHOR.ID);
		public static Identity<RBookRecord, Long> IDENTITY_BOOK = createIdentity(TBook.BOOK, TBook.BOOK.ID);
	}

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<RAuthorRecord> PK_AUTHOR = createUniqueKey(TAuthor.AUTHOR, TAuthor.AUTHOR.ID);
		public static final UniqueKey<RBookRecord> PK_BOOK = createUniqueKey(TBook.BOOK, TBook.BOOK.ID);
	}
}
