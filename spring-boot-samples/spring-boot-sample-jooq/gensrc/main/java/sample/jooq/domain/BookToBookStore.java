/**
 * This class is generated by jOOQ
 */
package sample.jooq.domain;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "https://www.jooq.org",
		"jOOQ version:3.8.2" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BookToBookStore extends TableImpl<Record> {

	private static final long serialVersionUID = -1360744633;

	/**
	 * The reference instance of <code>PUBLIC.BOOK_TO_BOOK_STORE</code>
	 */
	public static final BookToBookStore BOOK_TO_BOOK_STORE = new BookToBookStore();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<Record> getRecordType() {
		return Record.class;
	}

	/**
	 * The column <code>PUBLIC.BOOK_TO_BOOK_STORE.NAME</code>.
	 */
	public final TableField<Record, String> NAME = createField("NAME",
			org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.BOOK_TO_BOOK_STORE.BOOK_ID</code>.
	 */
	public final TableField<Record, Integer> BOOK_ID = createField("BOOK_ID",
			org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.BOOK_TO_BOOK_STORE.STOCK</code>.
	 */
	public final TableField<Record, Integer> STOCK = createField("STOCK",
			org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>PUBLIC.BOOK_TO_BOOK_STORE</code> table reference
	 */
	public BookToBookStore() {
		this("BOOK_TO_BOOK_STORE", null);
	}

	/**
	 * Create an aliased <code>PUBLIC.BOOK_TO_BOOK_STORE</code> table reference
	 */
	public BookToBookStore(String alias) {
		this(alias, BOOK_TO_BOOK_STORE);
	}

	private BookToBookStore(String alias, Table<Record> aliased) {
		this(alias, aliased, null);
	}

	private BookToBookStore(String alias, Table<Record> aliased, Field<?>[] parameters) {
		super(alias, null, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Schema getSchema() {
		return Public.PUBLIC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<Record> getPrimaryKey() {
		return Keys.CONSTRAINT_2;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<Record>> getKeys() {
		return Arrays.<UniqueKey<Record>>asList(Keys.CONSTRAINT_2);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<Record, ?>> getReferences() {
		return Arrays.<ForeignKey<Record, ?>>asList(Keys.FK_B2BS_BOOK_STORE,
				Keys.FK_B2BS_BOOK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BookToBookStore as(String alias) {
		return new BookToBookStore(alias, this);
	}

	/**
	 * Rename this table
	 */
	@Override
	public BookToBookStore rename(String name) {
		return new BookToBookStore(name, null);
	}

}
