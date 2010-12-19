package org.directcache;

import org.directcache.impl.CacheEntryImpl;
import org.directcache.impl.DirectCacheImpl;

public interface ICacheSupervisor {

	public abstract long signalLRUCollectionNeeded(DirectCacheImpl cache,
			long bytesToFree);

	public abstract void signalWeDeleted(String key);

	public abstract void signalWeInserted(CacheEntryImpl newEntry);

	public abstract void signalWeRetrevied(ICacheEntry entry);

	public abstract void signalReset();

	public abstract long signalCollectExpiredNeeded(
			DirectCacheImpl cache, long bytesToFree);

}