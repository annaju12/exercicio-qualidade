PreparedStatement stmt = conexao.prepareStatement(
    "SELECT * FROM usuario WHERE login = ?"
);
stmt.setString(1, login);