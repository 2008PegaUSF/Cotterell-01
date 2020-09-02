package dao;

import java.sql.SQLException;
import java.util.List;
import beans.Album;





public interface BankuserDao {
//CRUD ops
	public List<Album> getAllAlbums() throws SQLException;
	public List<Album> getAllAlbumsByArtistId(int id) throws SQLException;
}
