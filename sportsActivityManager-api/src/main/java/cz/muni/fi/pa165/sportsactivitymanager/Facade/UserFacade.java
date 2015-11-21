package cz.muni.fi.pa165.sportsactivitymanager.Facade;

import cz.muni.fi.pa165.sportsactivitymanager.Dto.UserAuthenticateDTO;
import cz.muni.fi.pa165.sportsactivitymanager.Dto.UserDTO;

import java.util.Collection;

/**
 *
 * @author Petra Gašparíková
 */
public interface UserFacade {
    
    Long createUser(UserDTO user);
    void deleteUser(UserDTO user);
    void updateUser(UserDTO user);
    UserDTO getUserById(Long id);
    Collection<UserDTO> getUsersByName(String name);
    UserDTO getUserByEmail(String email);
    Collection<UserDTO> getAllUsers();
    void registerUser(UserDTO user, String password);
    boolean userAuthenticate(UserAuthenticateDTO user);
    
}
