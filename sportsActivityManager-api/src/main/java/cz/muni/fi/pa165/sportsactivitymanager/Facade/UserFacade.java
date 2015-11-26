package cz.muni.fi.pa165.sportsactivitymanager.Facade;

import cz.muni.fi.pa165.sportsactivitymanager.Dto.UserCreateDTO;
import cz.muni.fi.pa165.sportsactivitymanager.Dto.UserDTO;

import java.util.Collection;

/**
 *
 * @author Petra Gašparíková
 */
public interface UserFacade {
    
    Long createUser(UserCreateDTO user);
    void deleteUser(Long id);
    void updateUser(UserDTO user);
    UserDTO getUserById(Long id);
    Collection<UserDTO> getUsersByName(String name);
    UserDTO getUserByEmail(String email);
    Collection<UserDTO> getAllUsers();
    
}
