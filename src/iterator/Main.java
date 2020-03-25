package iterator;

public class Main {

	public static void main(String[] args) {

		// ブランチ切り替えテスト
		BookShelf bookShelf = new BookShelf(4);

		bookShelf.appendBook(new Book("Around the World in 80Days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cin"));
		bookShelf.appendBook(new Book("Daddy"));
		bookShelf.appendBook(new Book("Daddy2"));

		Iterator it = bookShelf.iterator();

		while (it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}

	}

}
