package com.map.mutual.side.auth.svc;

import com.map.mutual.side.auth.model.dto.UserInWorld;
import com.map.mutual.side.auth.model.dto.UserInfoDto;
import com.map.mutual.side.auth.model.dto.WorldInviteAccept;
import com.map.mutual.side.auth.model.dto.notification.NotiDto;
import com.map.mutual.side.auth.model.dto.notification.extend.notificationDto;
import com.map.mutual.side.auth.model.entity.UserEntity;
import com.map.mutual.side.common.exception.YOPLEServiceException;
import com.map.mutual.side.world.model.dto.WorldDto;

import java.util.List;
import java.util.Optional;

/**
 * fileName       : UserService
 * author         : kimjaejung
 * createDate     : 2022/03/16
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/03/16        kimjaejung       최초 생성
 *
 */
public interface UserService {
    UserInfoDto findUser(String id, String phone);
    List<UserInWorld> worldUsers(long worldId, String suid);

    //2. 월드에 참여하기.
    WorldDto JoinWorld( String worldinvitationCode);
    UserInfoDto userDetails(String suid);
    UserInfoDto userInfoUpdate(String suid, String userId, String profileUrl);
    void userLogout(String suid);
    UserInfoDto signUp(UserInfoDto user) throws Exception;
    void userWorldInviting(String suid, String targetSuid, Long worldId)  throws YOPLEServiceException;
    Long getRecentAccessWorldID(String suid);

    NotiDto notificationList(String suid);
    
    WorldDto inviteJoinWorld(WorldInviteAccept invited);


}
