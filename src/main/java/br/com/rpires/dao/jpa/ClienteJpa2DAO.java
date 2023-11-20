/**
 *
 */
package br.com.rpires.dao.jpa;

import br.com.rpires.dao.generic.jpa.GenericJpaDAO;
import br.com.rpires.domain.jpa.ClienteJpa;
import br.com.rpires.domain.jpa.ClienteJpa2;

/**
 * @author rodrigo.pires
 *
 */
public class ClienteJpa2DAO
  extends GenericJpaDAO<ClienteJpa2, Long>
  implements IClienteJpaDAO<ClienteJpa2> {

  public ClienteJpa2DAO(String db) {
    super(ClienteJpa2.class, db);
  }
}
