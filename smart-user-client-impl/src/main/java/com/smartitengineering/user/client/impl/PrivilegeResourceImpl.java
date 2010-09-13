/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartitengineering.user.client.impl;

import com.smartitengineering.smartuser.client.api.OrganizationResource;
import com.smartitengineering.smartuser.client.api.Privilege;
import com.smartitengineering.smartuser.client.api.PrivilegeResource;
import com.smartitengineering.util.rest.atom.AbstractFeedClientResource;
import com.smartitengineering.util.rest.client.Resource;
import com.smartitengineering.util.rest.client.ResourceLink;
import com.smartitengineering.util.rest.client.SimpleResourceImpl;
import com.sun.jersey.api.client.config.ClientConfig;
import org.apache.abdera.model.Feed;
import org.apache.abdera.model.Link;

/**
 *
 * @author russel
 */
public class PrivilegeResourceImpl extends AbstractFeedClientResource<Resource<? extends Feed>> implements
    PrivilegeResource {

  private Resource<? extends Privilege> privilege;

  public PrivilegeResourceImpl(ResourceLink privLink, Resource referrer) {

    super(referrer, privLink);
    final ResourceLink altLink = getRelatedResourceUris().getFirst(Link.REL_ALTERNATE);
    privilege = new SimpleResourceImpl<com.smartitengineering.user.client.impl.domain.Privilege>(
        this, altLink.getUri(), altLink.getMimeType(), com.smartitengineering.user.client.impl.domain.Privilege.class,
        null, false, null, null);
  }

  @Override
  protected void processClientConfig(ClientConfig clientConfig) {
  }

  @Override
  protected Resource<? extends Feed> instantiatePageableResource(ResourceLink link) {
    return null;
  }

  @Override
  public Privilege getPrivilege() {
    return privilege.getLastReadStateOfEntity();
  }

  @Override
  public OrganizationResource getOrganizationResource() {
    throw new UnsupportedOperationException("Not supported yet.");
  }
}
