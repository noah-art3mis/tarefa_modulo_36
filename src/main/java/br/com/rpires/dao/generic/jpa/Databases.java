package br.com.rpires.dao.generic.jpa;

// parametrizar o construtor de DAOs (algo como dependency injection) permite excluir algumas classes.

public enum Databases {
  PSQL_PRODUCTION("Postgre1"),
  PSQL_STAGING("Postgre2"),
  MYSQL_STAGING("Mysql1");

  private final String value;

  Databases(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
